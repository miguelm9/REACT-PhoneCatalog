import React from "react";
import PropTypes from "prop-types";

// import the Phone component
import Phone from "./Phone";

function PhoneList(props) {
  return (
    <div>{props.contacts.map(c => <Phone key={c.id} name={c.name} image={c.image}/>)}</div>
  );
}

PhoneList.propTypes = {
  contacts: PropTypes.array.isRequired
};

export default PhoneList;
