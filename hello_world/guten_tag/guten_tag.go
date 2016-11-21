package main

import (
	"io"
	"net/http"
)

func msg(w http.ResponseWriter, r *http.Request) {
	io.WriteString(w, "Guten tag!")
}

func main() {
	http.HandleFunc("/", msg)
	http.ListenAndServe(":8000", nil)
}
