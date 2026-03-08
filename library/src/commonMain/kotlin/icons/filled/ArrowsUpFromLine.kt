package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ArrowsUpFromLine: ImageVector
    get() {
        if (_ArrowsUpFromLine != null) {
            return _ArrowsUpFromLine!!
        }
        _ArrowsUpFromLine = ImageVector.Builder(
            name = "Filled.ArrowsUpFromLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19.75f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.5f)
                horizontalLineTo(4f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2.5f)
                close()
                moveTo(5.75f, 17f)
                verticalLineTo(6.75f)
                lineToRelative(-0.75f, 1f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -1.5f)
                lineToRelative(3f, -4f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineToRelative(3f, 4f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 1.5f)
                lineToRelative(-0.75f, -1f)
                verticalLineTo(17f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.5f, 0f)
                moveToRelative(10f, 0f)
                verticalLineTo(6.75f)
                lineToRelative(-0.75f, 1f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -1.5f)
                lineToRelative(3f, -4f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineToRelative(3f, 4f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 1.5f)
                lineToRelative(-0.75f, -1f)
                verticalLineTo(17f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
        }.build()

        return _ArrowsUpFromLine!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsUpFromLine: ImageVector? = null
