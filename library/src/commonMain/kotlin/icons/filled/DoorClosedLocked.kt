package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.DoorClosedLocked: ImageVector
    get() {
        if (_DoorClosedLocked != null) {
            return _DoorClosedLocked!!
        }
        _DoorClosedLocked = ImageVector.Builder(
            name = "Filled.DoorClosedLocked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.583f, 19.75f)
                lineTo(20.5f, 19.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-17f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.917f)
                lineTo(5.417f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, -2.75f)
                horizontalLineToRelative(7.666f)
                arcToRelative(2.747f, 2.747f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 2.747f)
                close()
                moveTo(15.75f, 12.355f)
                curveToRelative(0f, -0.814f, -0.639f, -1.533f, -1.497f, -1.536f)
                verticalLineToRelative(-0.822f)
                curveToRelative(0f, -0.711f, -0.268f, -1.3f, -0.725f, -1.702f)
                arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.543f, -0.545f)
                curveToRelative(-1.063f, 0.02f, -2.238f, 0.78f, -2.238f, 2.247f)
                verticalLineToRelative(0.822f)
                curveToRelative(-0.858f, 0.003f, -1.497f, 0.722f, -1.497f, 1.536f)
                verticalLineToRelative(2.359f)
                curveToRelative(0f, 0.816f, 0.641f, 1.536f, 1.502f, 1.536f)
                horizontalLineToRelative(4.496f)
                curveToRelative(0.86f, 0f, 1.502f, -0.72f, 1.502f, -1.536f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.763f, 12.32f)
                horizontalLineToRelative(4.474f)
                arcToRelative(0.05f, 0.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.013f, 0.035f)
                verticalLineToRelative(2.359f)
                arcToRelative(0.05f, 0.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.013f, 0.036f)
                horizontalLineTo(9.763f)
                arcToRelative(0.05f, 0.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.013f, -0.036f)
                verticalLineToRelative(-2.359f)
                curveToRelative(0f, -0.02f, 0.008f, -0.03f, 0.013f, -0.036f)
                moveToRelative(2.775f, -2.897f)
                curveToRelative(0.107f, 0.094f, 0.215f, 0.26f, 0.215f, 0.575f)
                verticalLineToRelative(0.822f)
                horizontalLineToRelative(-1.506f)
                verticalLineToRelative(-0.822f)
                curveToRelative(0f, -0.47f, 0.328f, -0.738f, 0.768f, -0.747f)
                arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.523f, 0.172f)
            }
        }.build()

        return _DoorClosedLocked!!
    }

@Suppress("ObjectPropertyName")
private var _DoorClosedLocked: ImageVector? = null
