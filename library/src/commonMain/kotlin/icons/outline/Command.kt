package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Command: ImageVector
    get() {
        if (_Command != null) {
            return _Command!!
        }
        _Command = ImageVector.Builder(
            name = "Outline.Command",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.012f, 5.977f)
                verticalLineToRelative(12.046f)
                curveToRelative(0f, 2.645f, 3.316f, 3.954f, 5.14f, 2.13f)
                curveToRelative(1.825f, -1.825f, 0.516f, -5.141f, -2.13f, -5.141f)
                horizontalLineTo(5.978f)
                curveToRelative(-2.645f, 0f, -3.953f, 3.316f, -2.13f, 5.14f)
                curveToRelative(1.825f, 1.825f, 5.142f, 0.516f, 5.142f, -2.13f)
                verticalLineTo(5.978f)
                curveToRelative(0f, -2.645f, -3.317f, -3.953f, -5.141f, -2.13f)
                curveToRelative(-1.824f, 1.825f, -0.516f, 5.142f, 2.13f, 5.142f)
                horizontalLineToRelative(12.045f)
                curveToRelative(2.645f, 0f, 3.954f, -3.317f, 2.13f, -5.141f)
                reflectiveCurveToRelative(-5.141f, -0.516f, -5.141f, 2.13f)
            }
        }.build()

        return _Command!!
    }

@Suppress("ObjectPropertyName")
private var _Command: ImageVector? = null
