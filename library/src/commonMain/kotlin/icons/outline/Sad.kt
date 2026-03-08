package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Sad: ImageVector
    get() {
        if (_Sad != null) {
            return _Sad!!
        }
        _Sad = ImageVector.Builder(
            name = "Outline.Sad",
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
                moveTo(9f, 16f)
                curveToRelative(0.85f, -0.63f, 1.885f, -1f, 3f, -1f)
                reflectiveCurveToRelative(2.15f, 0.37f, 3f, 1f)
                moveToRelative(-5.5f, -5.5f)
                verticalLineTo(10f)
                moveToRelative(5f, 0.5f)
                verticalLineTo(10f)
            }
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
        }.build()

        return _Sad!!
    }

@Suppress("ObjectPropertyName")
private var _Sad: ImageVector? = null
