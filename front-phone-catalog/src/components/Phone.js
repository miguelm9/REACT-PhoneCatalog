import React from "react";
import PropTypes from "prop-types";
import "./Phone.css";
import {useHistory} from "react-router"
import {Link} from 'react-router-dom';


function Phone(props) {
  const handleViewMoreButton = () => {
    const history = useHistory();
    history.push('/details')
    }
  return (
    <div>
      <div className="phone" >
        <span>{props.name}</span>
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
