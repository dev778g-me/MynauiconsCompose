package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SkipBack: ImageVector
    get() {
        if (_SkipBack != null) {
            return _SkipBack!!
        }
        _SkipBack = ImageVector.Builder(
            name = "Outline.SkipBack",
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
                moveTo(4.5f, 3f)
                verticalLineToRelative(18f)
                moveToRelative(4.726f, -8.22f)
                lineToRelative(8.65f, 6.92f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.624f, -0.78f)
                verticalLineTo(5.08f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.625f, -0.78f)
                lineToRelative(-8.649f, 6.92f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.56f)
            }
        }.build()

        return _SkipBack!!
    }

@Suppress("ObjectPropertyName")
private var _SkipBack: ImageVector? = null
