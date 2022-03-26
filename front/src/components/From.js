import React, { useState } from 'react'
import { connect } from 'react-redux';
import { fetchRandom } from '../actions';

const From = (props) => {// component stateless
  const [state, setState] = useState();
  const onSubmit = (e) => {
    e.preventDefault();
    props.dispatch(fetchRandom(state));
  };
  return <div>
    <form onSubmit={onSubmit}>
      <label htmlFor="list">¿Cuántos dados va a lanzar?</label>
      
      <select id="numDice"
        onChange={(e) => setState(e.target.value)}>
        <option value="blank"></option>
        <option value="value1">1</option>
        <option value="value2">2</option>
      </select>
      <br />
      <br />
      <button type="submit" disabled={props.loading}>
        Enviar
      </button>
    </form>
  </div>
}


const stateMapToPros = state => {
  return {
    loading: state.view.loading
  }
}


export default connect(stateMapToPros)(From)
