import React from "react";
import "./Phone.css";
import {Link} from 'react-router-dom';
import {connect} from "react-redux";
import updateWord from "../store/phone/action"


const Phone = (props) => {

  return (
    <div>
      <div className="phone" >
        <span>{props.name}</span>
        <img src={props.image} className="image" alt=""></img>
      </div>
      
      <div className="buttonDiv">
        <button onClick={ () => {updateWord(props.id);}} className="button">
          <Link className="link" to={"/details"}>View more</Link>
        </button>
      </div>

    </div>
  );
}


export default connect(null, {updateWord})(Phone);
