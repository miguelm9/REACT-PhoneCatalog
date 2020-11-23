import React from "react";
import PropTypes from "prop-types";
import "./Phone.css";
import {Link} from 'react-router-dom';


function Phone(props) {
  console.log(props.image1);
  
  return (
    <div>
      <div className="phone" >
        <span>{props.name}</span> 
        <img src={props.image} className="image" alt=""></img>
      </div>
      
      <div className="buttonDiv">
        <button className="button">
          <Link className="link" to={"/details"}>View more</Link>
        </button>
      </div>

    </div>
  );
}

Phone.propTypes = {
  name: PropTypes.string.isRequired
};

export default Phone;
