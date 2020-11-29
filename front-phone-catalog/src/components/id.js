import {connect} from 'react-redux';
import { selectActiveID } from '../store/phone/reducer';
import React from 'react';
import {updateWord} from "../store/phone/action"


const storedID = ({ id }) => (
<output>{id}</output>
);

function mapStateToProps(state) {
    return {
        id: selectActiveID(state),
    }
}

const mapDispatchToProps = {
    dispatchUpdateWord: (id) => updateWord(id)
};

export default connect(mapStateToProps, mapDispatchToProps)(storedID);