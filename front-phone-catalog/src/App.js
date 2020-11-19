import React, { Component } from "react";
import logo from './components/gs-logo.png';
import "./App.css";

import axios from "axios";

import PhoneList from "./components/PhoneList";

class App extends Component {
  // default state object
  state = {
    phones: []
  };

  componentDidMount() {
    axios
      .get("https://jsonplaceholder.typicode.com/users")
      .then(response => {
        // create an array of phones only with relevant data
        const newPhones = response.data.map(c => {
          return {
            id: c.id,
            name: c.name
          };
        });

        // create a new "state" object without mutating
        // the original state object.
        const newState = Object.assign({}, this.state, {
          phones: newPhones
        });

        // store the new state object in the component's state
        this.setState(newState);
      })
      .catch(error => console.log(error));
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">aka Tiesos S.A</h1>
        </header>

        <PhoneList phones={this.state.phones} />
      </div>
    );
  }
}

export default App;
