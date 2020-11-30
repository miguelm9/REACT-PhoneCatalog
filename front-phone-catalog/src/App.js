import React, { Component } from "react";
import logo from './components/gs-logo.png';
import "./App.css";
import axios from "axios";
import PhoneList from "./components/PhoneList";

class App extends Component {
  state = {
    phones: []
  };

  componentDidMount() {
    axios
      .get("http://localhost:8080/phones")
      .then(response => {
        const newPhones = response.data.map(c => {
          return {
            id: c.id,
            name: c.name,
            image: c.imageFileName,
          };
        });
        const newState = Object.assign({}, this.state, {
          phones: newPhones
        });

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

        <PhoneList phones={this.state.phones} />
      </div>
    );
  }
}

export default App;
