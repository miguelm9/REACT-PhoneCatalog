import {connect} from 'react-redux';
import { selectActiveID } from '../store/phone/reducer';
import React from 'react';

const storedID = ({ id }) => (
	<output>ID: {id}</output>
);

function mapStateToProps(state) {
    return {
        id: selectActiveID(state)
    }
}

export default connect(mapStateToProps)(storedID);