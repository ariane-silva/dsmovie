import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";

function Listing() {
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