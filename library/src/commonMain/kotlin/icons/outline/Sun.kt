package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Sun: ImageVector
    get() {
        if (_Sun != null) {
            return _Sun!!
        }
        _Sun = ImageVector.Builder(
            name = "Outline.Sun",
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
                moveTo(16f, 12f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                moveToRelative(-4f, -9f)
                verticalLineToRelative(2f)
                moveToRelative(0f, 14.004f)
                verticalLineToRelative(2f)
                moveTo(5f, 12f)
                horizontalLineTo(3f)
                moveToRelative(18f, 0f)
                horizontalLineToRelative(-2f)
                moveToRelative(0f, -7f)
                lineToRelative(-2f, 2f)
                moveTo(5f, 5f)
                lineToRelative(2f, 2f)
                moveToRelative(0f, 10f)
                lineToRelative(-2f, 2f)
                moveToRelative(14f, 0f)
                lineToRelative(-2f, -2f)
            }
        }.build()

        return _Sun!!
    }

@Suppress("ObjectPropertyName")
private var _Sun: ImageVector? = null
