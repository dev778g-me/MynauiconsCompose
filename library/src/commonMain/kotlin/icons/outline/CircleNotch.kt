package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CircleNotch: ImageVector
    get() {
        if (_CircleNotch != null) {
            return _CircleNotch!!
        }
        _CircleNotch = ImageVector.Builder(
            name = "Outline.CircleNotch",
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
                moveTo(7.717f, 4f)
                arcTo(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11.956f)
                curveTo(3f, 16.951f, 7.03f, 21f, 12f, 21f)
                reflectiveCurveToRelative(9f, -4.05f, 9f, -9.044f)
                arcTo(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.283f, 4f)
            }
        }.build()

        return _CircleNotch!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNotch: ImageVector? = null
