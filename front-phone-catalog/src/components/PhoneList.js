import React from "react";
import PropTypes from "prop-types";

// import the Phone component
import Phone from "./Phone";

function PhoneList(props) {
	return (
		<div>{props.phones.map(c => <Phone key={c.id} name={c.name} />)}</div>
	);
}

PhoneList.propTypes = {
	contacts: PropTypes.array.isRequired
};

export default PhoneList;
