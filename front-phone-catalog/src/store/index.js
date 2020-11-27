import { createStore, combineReducers } from 'redux';
import idReducer from './phone/reducer';

const reducers = combineReducers({
    idReducer
});

const store = createStore(
    reducers,
    window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__()
);

export default store;