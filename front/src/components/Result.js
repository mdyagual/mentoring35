import React from 'react';
import { connect } from 'react-redux';
import DadoLanzado from './Dado';


export const Result = (props) => {
  const dado = props.result;

  return (
    <DadoLanzado value={dado}/>
    
   
    );
    
    
};


const stateMapToPros = (state) => {
  return {    
      result: state.random.result?.numero,
      
  };
};


export default connect(stateMapToPros)(Result)
