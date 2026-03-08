package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Daze: ImageVector
    get() {
        if (_Daze != null) {
            return _Daze!!
        }
        _Daze = ImageVector.Builder(
            name = "Outline.Daze",
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
                moveToRelative(8f, 12f)
                lineToRelative(2f, -1.5f)
                lineTo(8f, 9f)
                moveToRelative(8f, 3f)
                lineToRelative(-2f, -1.5f)
                lineTo(16f, 9f)
                moveToRelative(0f, 7.25f)
                lineToRelative(-1.333f, -1f)
                lineToRelative(-1.334f, 1f)
                lineToRelative(-1.333f, -1f)
                lineToRelative(-1.333f, 1f)
                lineToRelative(-1.334f, -1f)
                lineToRelative(-1.333f, 1f)
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

        return _Daze!!
    }

@Suppress("ObjectPropertyName")
private var _Daze: ImageVector? = null
