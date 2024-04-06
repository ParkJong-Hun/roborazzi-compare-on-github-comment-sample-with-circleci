# roborazzi-compare-on-github-comment-sample-with-circleci
This is a sample of using [Roborazzi](https://github.com/takahirom/roborazzi) in Circle CI, which is widely used in mobile development, to issue comments on a Pull Request by a bot when changes exist.
Inspired by [CircleCI code](https://github.com/kosenda/hiragana-converter/blob/develop/.circleci/config.yml) in [kosenda's app repository](https://github.com/kosenda/hiragana-converter), Github Actions code in [takahirom's sample repository](https://github.com/takahirom/roborazzi-compare-on-github-comment-sample).

## Artifact as Github Branch Mode
When any pull request is created or updated, This will pushes historical test output and comparison output as a branch to remote repository.
### Requirement
1. Register a Deploy key with read/**write** access to GitHub and register the corresponding private key in CircleCI.
2. Prepare **Github bot account** for commenting or pushing branches, and add the account information to circle ci project's environment variables.
  - `GITHUB_BOT_NAME`
  - `GITHUB_BOT_EMAIL`
  - `GITHUB_BOT_ACCESS_TOKEN`

## Artifact as CircleCI Artifact Mode
When any pull request is created or updated, This will store historical test output and comparison output as a artifact to circle ci.
### Requirement
> [!WARNING]
> preparing...
