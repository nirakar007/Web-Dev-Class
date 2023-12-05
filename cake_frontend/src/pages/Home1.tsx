
import "./Home1.css";
function Home1() {
    return (
        <div className={"container"}>
            <div className={"header"}>
                <div className={"logo"}>
                    <img src={"test.jpg"}/>
                </div>
                <div className={"searchbox"}>
                    <input type={"text"}/>
                </div>
                <div className={"btn-wrapper"}>
                    <button id="btn-login">Login</button>
                    <button>register</button>
                </div>
            </div>
            <div className={"main"}>
                <div className={"main-left"}>
                    <div className={"main-left-header"}>
                        main-left header
                    </div>
                    <div className={"main-left-bottom"}>
                        main-left bottom
                    </div>
                </div>
                <div className={"main-right"}>
                    <ul>
                        <li className={"list"}>1</li>
                        <li className={"list"}>2</li>
                        <li className={"list"}>3</li>

                    </ul>
                </div>
            </div>

        </div>
    )
}


export default Home1;