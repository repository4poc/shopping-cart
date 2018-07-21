import React from 'react';
import ProductList from './containers/ProductList';
import Cart from './containers/Cart';

class App extends React.Component {
  render(){
    return (
        <div className="container">
            <div className="row">
              <header>
                   <h1>Welcome, Happy Shopping</h1>
                   <header><small>By: Varinder Gupta</small></header>
              </header>
                <div className="col-md-8">
                    <ProductList />
                </div>
                <div className="col-md-4">
                    <Cart />
                </div>
            </div>
        </div>
    );
  }
}

export default App;
