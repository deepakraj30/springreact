import React from 'react';
import CarsService from '../services/CarsService';

class CarsComponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            cars:[]
        }
    }

    componentDidMount(){
        CarsService.getCars().then((response) => {
            this.setState({ cars: response.data})
        });
    }

    render (){
        return (
            <div>
                <h1 className = "text-center"> Cars Arena</h1>
                <table className = "table table">
                    <thead>
                        <tr>

                            <td> Sales Posititon</td>
                            <td> Brand Name</td>
                            <td> Model Name</td>
                            <td> Variant</td>
                            <td> Transmission</td>
                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.cars.map(
                                cars => 
                                <tr key = {cars.id}>
                                     <td> {cars.id}</td>   
                                     <td> {cars.brandname}</td>   
                                     <td> {cars.modelname}</td>   
                                     <td> {cars.variant}</td>  
                                     <td> {cars.transmission}</td> 
                                </tr>
                            )
                        }

                    </tbody>
                </table>

            </div>

        )
    }
}

export default CarsComponent