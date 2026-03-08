package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ArrowDiagonalTwo: ImageVector
    get() {
        if (_ArrowDiagonalTwo != null) {
            return _ArrowDiagonalTwo!!
        }
        _ArrowDiagonalTwo = ImageVector.Builder(
            name = "Filled.ArrowDiagonalTwo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.238f, 19.601f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.06f)
                lineToRelative(-4.929f, -4.929f)
                lineToRelative(2.32f, -2.32f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                horizontalLineToRelative(-4.95f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(4.95f)
                curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
                lineToRelative(2.32f, -2.319f)
                lineToRelative(4.928f, 4.928f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 0f)
                moveTo(10.763f, 4.399f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                lineToRelative(4.929f, 4.928f)
                lineToRelative(2.32f, -2.32f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(4.95f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                horizontalLineToRelative(-4.95f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                lineToRelative(2.32f, -2.32f)
                lineToRelative(-4.93f, -4.928f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
            }
        }.build()

        return _ArrowDiagonalTwo!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDiagonalTwo: ImageVector? = null
