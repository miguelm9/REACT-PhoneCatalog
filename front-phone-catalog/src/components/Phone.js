import React from "react";
import "./Phone.css";
import {Link} from 'react-router-dom';
import {connect} from "react-redux";

var idStore = "";

const Phone = (props) => {

  return (
    <div>
      <div className="phone" >
        <span>{props.name}</span>
        <img src={props.image} className="image" alt=""></img>
      </div>
      
      <div className="buttonDiv">
        <button className="button">
          <Link onClick={() => idStore = props.id} className="link" to={"/details"}>View more</Link>
        </button>
      </div>

    </div>
  );
}

export default connect(null, {idStore})(Phone);
