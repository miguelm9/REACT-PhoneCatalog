const updateWord = (id) => {
    alert("They changed it to "+ id);
    return {
        type: 'UPDATE_ID',
        payload: id
    }
};

export default updateWord;