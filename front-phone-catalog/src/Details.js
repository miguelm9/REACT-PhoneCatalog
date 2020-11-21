import React, { Component } from "react";
import logo from './components/gs-logo.png';
import "./App.css";
import {Link} from 'react-router-dom';

class Details extends Component {

  render() {
    return (
      <div className="App">
        <header className="App-header">
		  <Link to={"/"}><img src={logo} className="App-logo" alt="logo"/></Link>
          <h1 className="App-title">Phone Details: </h1>
        </header>
      </div>
    );
  }
}

export default Details;
