def retrieve_major(semver):
	return semver.split(".")[0]

def retrieve_minor(semver):
	return semver.split(".")[1]

def retrieve_patch(semver):
	return semver.split(".")[2]