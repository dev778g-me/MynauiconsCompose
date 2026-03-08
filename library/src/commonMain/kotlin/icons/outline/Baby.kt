package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Baby: ImageVector
    get() {
        if (_Baby != null) {
            return _Baby!!
        }
        _Baby = ImageVector.Builder(
            name = "Outline.Baby",
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
                moveTo(9f, 15f)
                curveToRelative(0.85f, 0.63f, 1.885f, 1f, 3f, 1f)
                reflectiveCurveToRelative(2.15f, -0.37f, 3f, -1f)
                moveTo(12.25f, 3f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 3.927f)
                moveToRelative(-4f, 3.373f)
                curveToRelative(-0.214f, -0.19f, -0.473f, -0.3f, -0.75f, -0.3f)
                reflectiveCurveToRelative(-0.536f, 0.11f, -0.75f, 0.3f)
                moveToRelative(7.5f, 0f)
                curveToRelative(-0.214f, -0.19f, -0.473f, -0.3f, -0.75f, -0.3f)
                reflectiveCurveToRelative(-0.536f, 0.11f, -0.75f, 0.3f)
            }
        }.build()

        return _Baby!!
    }

@Suppress("ObjectPropertyName")
private var _Baby: ImageVector? = null
