import React from 'react';

function Header(props) {
  const { title = 'Vishwas', subtitle = 'Cp' } = props;

  return (
    <div>
      <h1>{title}</h1>
      <h2>{subtitle}</h2>
    </div>
  );
}

export default Header;
