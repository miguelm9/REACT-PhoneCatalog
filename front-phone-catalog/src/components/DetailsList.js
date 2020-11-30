import React from "react";
import PropTypes from "prop-types";
import Phone from "./Phone";

function DetailsList(props) {
  return (
    <div>{props.details.map(c => <Phone id={c.id} name={c.name} image={c.image}/>)}</div>
  );
}

DetailsList.propTypes = {
  phones: PropTypes.array.isRequired
};

export default DetailsList;