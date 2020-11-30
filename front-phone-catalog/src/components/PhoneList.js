import React from "react";
import PropTypes from "prop-types";
import Phone from "./Phone";

function PhoneList(props) {
  return (
    <div>{props.phones.map(c => <Phone id={c.id} name={c.name} image={c.image}/>)}</div>
  );
}

PhoneList.propTypes = {
  phones: PropTypes.array.isRequired
};

export default PhoneList;
