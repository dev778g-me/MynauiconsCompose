package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ThreeCircle: ImageVector
    get() {
        if (_ThreeCircle != null) {
            return _ThreeCircle!!
        }
        _ThreeCircle = ImageVector.Builder(
            name = "Outline.ThreeCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 9.994f)
                curveToRelative(0f, -2.659f, 5f, -2.659f, 5f, 0f)
                curveToRelative(0f, 0f, 0f, 2.006f, -2.5f, 2.006f)
                curveToRelative(2.5f, 0f, 2.5f, 2.006f, 2.5f, 2.006f)
                curveToRelative(0f, 2.659f, -5f, 2.659f, -5f, 0f)
            }
        }.build()

        return _ThreeCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ThreeCircle: ImageVector? = null
