import {useEffect, useState} from 'react';
import {listComponents} from "../services/objectService.ts";

const ListComponent = () => {

    const [banks, setBanks] = useState([])

    useEffect(()=>{
        listComponents().then((response) => {
            setBanks(response.data);
        }).catch(error=>{
            console.error(error);
        })
    }, [])

    return (
        <div className='container'>

            <h2>List of ...</h2>
            <table className='table table-striped table-bordered'>
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>address</th>
                        <th>phone</th>
                    </tr>
                </thead>
                <tbody>
                    {banks.map(bank => (
                                <tr key = {bank.id}>
                                    <th>{bank.id}</th>
                                    <td>{bank.name}</td>
                                    <td>{bank.address}</td>
                                    <td>{bank.phone}</td>
                                </tr>
                            )
                        )
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ListComponent;