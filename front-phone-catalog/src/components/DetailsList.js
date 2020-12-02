import React from "react";
import PropTypes from "prop-types";

function DetailsList(props) {
  return (
    <div className="detail">
      <h1 className="phoneTitle">{props.details.map(c => c.name)} Details</h1>
      <img src={props.details.map(c => c.image)} className="imageDetails" alt=""></img>
      <h1>Manufacturer: {props.details.map(c => c.manufacturer)}</h1>
      <h1>Description: {props.details.map(c => c.description)}</h1>
      <h1>Color: {props.details.map(c => c.color)}</h1>
      <h1>Price ($): {props.details.map(c => c.price)}</h1>
      <h1>Screen size: {props.details.map(c => c.screen)}</h1>
      <h1>Processor: {props.details.map(c => c.processor)}</h1>
      <h1>Ram (GB): {props.details.map(c => c.ram)}</h1>
    </div>
  );
}

DetailsList.propTypes = {
  phones: PropTypes.array.isRequired
};

export default DetailsList;