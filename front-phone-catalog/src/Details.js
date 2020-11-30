import React from "react";
import logo from './components/gs-logo.png';
import "./App.css";
import {Link} from 'react-router-dom';
import { selectActiveID } from './store/phone/reducer';
import {updateWord} from "./store/phone/action"
import {connect} from 'react-redux';
import LeID from './components/id'

const Details = ({ id }) => (
  <div className="App">
        <header className="App-header">
		    <Link to={"/"}><img src={logo} className="App-logo" alt="logo"/></Link>
        <h1 className="App-title">Phone Details</h1>
        <text>ID: {id}</text>
        </header>
        <LeID id={id}/>
  </div>
);

function mapStateToProps(state) {
  return {
      id: selectActiveID(state),
  }
}

const mapDispatchToProps = {
  dispatchUpdateWord: (id) => updateWord(id)
};

export default connect(mapStateToProps, mapDispatchToProps)(Details);