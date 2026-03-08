package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Check: ImageVector
    get() {
        if (_Check != null) {
            return _Check!!
        }
        _Check = ImageVector.Builder(
            name = "Filled.Check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.577f, 6.183f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.24f, 1.394f)
                lineToRelative(-5.666f, 8.02f)
                curveToRelative(-0.36f, 0.508f, -0.665f, 0.94f, -0.94f, 1.269f)
                curveToRelative(-0.287f, 0.34f, -0.61f, 0.658f, -1.038f, 0.86f)
                arcToRelative(2.83f, 2.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.03f, 0.153f)
                curveToRelative(-0.456f, -0.137f, -0.82f, -0.406f, -1.149f, -0.702f)
                curveToRelative(-0.315f, -0.285f, -0.672f, -0.668f, -1.09f, -1.116f)
                lineToRelative(-1.635f, -1.753f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.462f, -1.364f)
                lineToRelative(1.606f, 1.722f)
                curveToRelative(0.455f, 0.487f, 0.754f, 0.806f, 0.998f, 1.027f)
                curveToRelative(0.24f, 0.216f, 0.344f, 0.259f, 0.385f, 0.271f)
                curveToRelative(0.196f, 0.06f, 0.405f, 0.045f, 0.598f, -0.046f)
                curveToRelative(0.046f, -0.022f, 0.149f, -0.085f, 0.36f, -0.338f)
                curveToRelative(0.216f, -0.257f, 0.473f, -0.62f, 0.863f, -1.171f)
                lineToRelative(5.642f, -7.986f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.394f, -0.24f)
            }
        }.build()

        return _Check!!
    }

@Suppress("ObjectPropertyName")
private var _Check: ImageVector? = null
