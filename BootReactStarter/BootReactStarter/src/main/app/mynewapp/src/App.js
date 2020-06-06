/*import React from 'react';*/
import logo from './logo.svg';
import './App.css';
/*import MyComponent from './components/MyComponent';*/

import React, { Component } from 'react';

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      data: [],
    };
  }

  componentDidMount() {

  fetch('http://localhost:8081/greeting', {
              method: 'GET',
              headers: {

              }
          })
              .then(response => {
                  if (response.status == 200) {
                      return response.json();
                  } else {
                      this.setState({ isLoading: false, error: false });
                  }
              })
              .then(responseJson => {
              alert('responseJson>>>>>>'+responseJson)
                  this.setState({ data:responseJson });
              })
              .catch(error => {
                  console.error(error);
                  this.setState({ isLoading: false }, () => { });
              });

  }

  render() {
          return (
            <ul>
              {this.state.data.map(item => (
                <li key={item.name}>
                  {item.name} {item.price}
                </li>
              ))}
            </ul>
          );
      }
    }

export default App;
