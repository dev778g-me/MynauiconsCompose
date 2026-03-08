package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Microchip: ImageVector
    get() {
        if (_Microchip != null) {
            return _Microchip!!
        }
        _Microchip = ImageVector.Builder(
            name = "Outline.Microchip",
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
                moveTo(17f, 3f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                moveTo(6f, 6f)
                horizontalLineTo(3f)
                moveToRelative(3f, 4f)
                horizontalLineTo(3f)
                moveToRelative(3f, 4f)
                horizontalLineTo(3f)
                moveToRelative(3f, 4f)
                horizontalLineTo(3f)
                moveTo(21f, 6f)
                horizontalLineToRelative(-3f)
                moveToRelative(3f, 4f)
                horizontalLineToRelative(-3f)
                moveToRelative(3f, 4f)
                horizontalLineToRelative(-3f)
                moveToRelative(3f, 4f)
                horizontalLineToRelative(-3f)
            }
        }.build()

        return _Microchip!!
    }

@Suppress("ObjectPropertyName")
private var _Microchip: ImageVector? = null
