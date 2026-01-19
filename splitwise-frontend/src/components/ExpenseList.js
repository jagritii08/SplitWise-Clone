
import axios from "axios";
import {useEffect,useState} from "react";

function ExpenseList(){
 const [data,setData]=useState([]);

 useEffect(()=>{
  axios.get("http://localhost:8080/api/expenses")
  .then(res=>setData(res.data));
 },[]);

 return(
  <div>
   <h3>All Expenses</h3>
   <ul>
    {data.map(e=>(
     <li key={e.id}>{e.description} - ₹{e.amount}</li>
    ))}
   </ul>
  </div>
 );
}
export default ExpenseList;
