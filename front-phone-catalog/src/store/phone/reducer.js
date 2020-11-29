const initialState = { id: -10 };

export default (state = initialState, action) => {
    if (action.type === 'UPDATE_ID') {
        return {
            ...state,
            id: action.payload
        }
    }
    return state;
};

export const selectActiveID = state => state.idReducer.id;