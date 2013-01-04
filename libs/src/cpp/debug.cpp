template<class T>
inline void print(T A)
{
    cout << "{ ";
    for (__typeof((A).begin()) i = (A).begin(); i != (A).end(); ++i) {
        cout << *i << ", ";
    }
    cout << "}" << endl;
}

template<class T>
inline void print2(T A)
{
    cout << "{" << endl;
    for (__typeof((A).begin()) i = (A).begin(); i != (A).end(); ++i) {
        cout << " { ";
        for (__typeof((*i).begin()) j = (*i).begin(); j != (*i).end(); j++) {
            cout << *j << ", ";
        }
        cout << "}";
        cout << endl;
    }
    cout << "}" << endl;
}

template<class T>
inline void printp(T A)
{
    cout << "{ ";
    for (__typeof((A).begin()) i = (A).begin(); i != (A).end(); ++i) {
        cout << "{" << i->first << ", " << i->second << "}";
        cout << ", ";
    }
    cout << "}" << endl;
}

template<typename T, size_t N>
inline void print(T (&A)[N])
{
    cout << "{ ";
    for (size_t i = 0; i < N; ++i) {
        cout << A[i];
        cout << ", ";
    }
    cout << "}" << endl;
}

template<typename T, size_t N, size_t M>
inline void print(T (&A)[N][M])
{
    cout << "{" << endl;;
    for (size_t i = 0; i < N; ++i) {
        cout << " { ";
        for (size_t j = 0; j < M; ++j) {
            cout << A[i][j];
            cout << ", ";
        }
        cout << "}" << endl;
    }
    cout << "}" << endl;
}

template<class T>
inline void print(T A[], int N)
{
    cout << "{ ";
    for (int i = 0; i < N; i++) {
        cout << A[i];
        cout << ", ";
    }
    cout << "}" << endl;
}

template<class T>
inline void print(T A[], int N, int M)
{
    cout << "{" << endl;
    for (int i = 0; i < N; ++i) {
        cout << " { ";
        for (int j = 0; j < M; ++j) {
            cout << A[i][j];
            cout << ", ";
        }
        cout << "}" << endl;
    }
    cout << "}" << endl;
}
