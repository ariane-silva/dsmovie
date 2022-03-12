import axios from "axios";
import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";
import { BASE_URL } from "utils/requests";

function Listing() {

  axios.get(`${BASE_URL}/movie?size=12&page=0`)
  .then(
    response => {console.log(response.data)}
  );
  return (
    <>
      <Pagination />

      <div className="container">
        <div className="row">
          <div className="col-sm-s6 col-lg-4 col-xl-3 mg-3">
            <MovieCard />
          </div>

        </div>
      </div>
    </>
  );
}

export default Listing;