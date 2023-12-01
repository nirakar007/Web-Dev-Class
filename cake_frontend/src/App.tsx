import './App.css'
import {createBrowserRouter, RouterProvider} from "react-router-dom";
import Home from "./pages/Home.tsx";
import About from "./pages/About.tsx";


const router = createBrowserRouter(
    [
        {
            path:"/home",
            element: <Home />
        },
        {
            path:"/about",
            element:<About />
        }
    ]
)

function App() {
    return (
    <>
        <RouterProvider router={router} />


        {/*<div style={{ position: 'absolute', height: '0px' }}>*/}
        {/*    <div style={{ position: 'absolute', top: '0px', left: '0px', width: '1080px', height: '1080px', backgroundColor: 'red' }} />*/}
        {/*</div>*/}

    </>
  )
}

export default App
