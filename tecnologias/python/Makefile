test:
	python3 -m unittest

clean:
	find . -name '*.pyc' -delete
	find . -name '*.pyo' -delete
	find . -name '__pycache__' -type d -delete
	rm -rf recursive build/ dist/ .pytest_cache/ .mypy_cache/ *.egg-info htmlcov/ .coverage

.PHONY: build test clean
