job('GameOfLife')
{
	scm{
		git('')
	}
triggers{
	scm('')
	}
steps {
	maven('-e clean test')
	}
}
