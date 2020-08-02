import React, { useState, useEffect } from 'react';
import logo from './logo.svg';
import './App.css';




function Greeting() {

  const [greeting, setGreeting] = useState<string>();

  const basePath = process.env.NODE_ENV === 'development' ? 'http://localhost:8080/' : '/';

  useEffect(() => {
    fetchGreeting();
  }, []);

  function fetchGreeting(name = 'initRequest'){
    fetch(`${basePath}greeting?name=${name}`)
    .then(res => res.text())
    .then(
      (result) => {
        setGreeting(result);
      },
      // Note: it's important to handle errors here
      // instead of a catch() block so that we don't swallow
      // exceptions from actual bugs in components.
      (error) => {
        setGreeting('error');
      }
    )
  }

  return (
    <div>
      <h2>{greeting}</h2>
      <input type="button" onClick={() => fetchGreeting('clickRequest')} value="Click Me!"/>
    </div>
  );
}

export default Greeting;
