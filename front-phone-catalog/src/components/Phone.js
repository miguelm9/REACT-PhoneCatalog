import React from "react";
import PropTypes from "prop-types";
import "./Phone.css";

function Phone(props) {
  return (
    <div className="phone">
      <span>{props.name}</span>
    </div>
  );
}

Phone.propTypes = {
  name: PropTypes.string.isRequired
};

export default Phone;
