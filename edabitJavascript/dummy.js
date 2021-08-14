class Followers extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      users: [],
      //follower: [],
      following: [],
      followingUsers: [],
    };
  }

  componentDidMount = () => {
    this.getUsers();
    this.getFollowing();
  };

  getUsers = async () => {
    try {
      const response = await axios(`http://localhost:7001/api/users`);
      this.setState({ users: response.data });
      console.log(response.data);
    } catch {
      this.setState({ error: true });
    }
  };

  getFollowing = async () => {
    const userId = this.props.user[0].id;

    try {
      const response = await axios(
        `http://localhost:7001/api/users/${userId}/following`
      );

      const tempFollowing = response.data.map((follow, index) => {
        return follow.followedId;
      });

      this.setState({
        following: response.data,
        followingUsers: tempFollowing,
      });
      console.log(response.data);
    } catch (error) {
      this.setState({ error: true });
    }
  };

  followUser = async (e) => {
    e.preventDefault();
    const userId = this.props.user[0].id;
    const followedId = e.target.value;

    try {
      const response = await axios.post(
        `http://localhost:7001/api/users/${userId}/follow/${followedId}`,
        {
          userId,
          followedId,
          followed: 1,
          createdAt: new Date().toISOString().slice(0, 10),
          updatedAt: new Date().toISOString().slice(0, 10),
        }
      );
      console.log(response.data);
      this.setState((state) => ({
        loggedIn: !state.loggedIn,
        followed: true,
      }));
    } catch (error) {
      console.log(error);
    }
  };

  unfollowUser = async (e) => {
    e.preventDefault();
    const userId = this.props.user[0].id;
    const followedId = e.target.value;

    try {
      const response = await axios.delete(
        `http://localhost:7001/api/users/${userId}/unfollow/${followedId}`
      );
      console.log(response);
      let array = [...this.state.following];
      let index = array.indexOf(followedId);
      if (index !== -1) {
        array.splice(index, 1);

        const tempFollowing = array.map((follow, index) => {
          return follow.followedId;
        });

        this.setState({
          following: array,
          followingUsers: tempFollowing,
        });
      }
    } catch (error) {
      this.setState({ error: true });
    }
  };

  render() {
    const { users, following } = this.state;
    const userId = this.props.user[0].id;

    // console.log(followingUsers);
    return (
      <div>
        <h2>Users in Unax</h2>
        <ul>
          {users.map((user, index) => {
            if (user.id !== userId) {
              return (
                <Card className="users" key={index}>
                  <CardBody>
                    <CardTitle>{user.user_name}</CardTitle>
                    {this.followingUsers.includes(user.id) ? (
                      <Button
                        id="btn-1"
                        value={user.id}
                        onClick={this.unfollowUser}
                      >
                        Unfollow
                      </Button>
                    ) : (
                      <Button
                        id="btn"
                        value={user.id}
                        onClick={this.followUser}
                      >
                        follow
                      </Button>
                    )}
                  </CardBody>
                </Card>
              );
            }
          })}
        </ul>
        <div>
          <h2>Following</h2>
          <ul>
            {following.map((follow, index) => {
              return (
                <Card key={index}>
                  <CardBody>
                    <CardTitle>{follow.followedId}</CardTitle>
                  </CardBody>
                </Card>
              );
            })}
          </ul>
        </div>
      </div>
    );
  }
}

export default withUser(Followers);
