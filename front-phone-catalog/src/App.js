import React, { Component } from "react";
import logo from './components/gs-logo.png';
import "./App.css";

import axios from "axios";

import PhoneList from "./components/PhoneList";

class App extends Component {
  state = {
    contacts: []
  };

  componentDidMount() {
    axios
      //.get("httyps://jsonplaceholder.typicode.com/users")
      .get("http://localhost:8080/phones")
      .then(response => {
        // create an array of phones only with relevant data
        const newContacts = response.data.map(c => {
        console.log(c.imageFileName);
          return {
            id: c.id,
            name: c.name,
            image: c.imageFileName,
          };

        });

        // create a new "state" object without mutating
        // the original state object.
        const newState = Object.assign({}, this.state, {
          contacts: newContacts
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
          <h1 className="App-title">Phone Catalog</h1>
        </header>

        <PhoneList contacts={this.state.contacts} />
      </div>
    );
  }
}

export default App;
