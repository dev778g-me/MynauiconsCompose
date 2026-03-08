package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ActivitySquare: ImageVector
    get() {
        if (_ActivitySquare != null) {
            return _ActivitySquare!!
        }
        _ActivitySquare = ImageVector.Builder(
            name = "Filled.ActivitySquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.962f, 2.421f)
                curveToRelative(1.276f, -0.171f, 2.908f, -0.171f, 4.981f, -0.171f)
                horizontalLineToRelative(0.114f)
                curveToRelative(2.073f, 0f, 3.705f, 0f, 4.98f, 0.171f)
                curveToRelative(1.31f, 0.176f, 2.354f, 0.545f, 3.175f, 1.367f)
                curveToRelative(0.822f, 0.821f, 1.19f, 1.866f, 1.367f, 3.174f)
                curveToRelative(0.171f, 1.276f, 0.171f, 2.908f, 0.171f, 4.981f)
                verticalLineToRelative(0.114f)
                curveToRelative(0f, 2.073f, 0f, 3.705f, -0.171f, 4.98f)
                curveToRelative(-0.176f, 1.31f, -0.545f, 2.354f, -1.367f, 3.175f)
                curveToRelative(-0.821f, 0.822f, -1.866f, 1.19f, -3.174f, 1.367f)
                curveToRelative(-1.276f, 0.171f, -2.908f, 0.171f, -4.981f, 0.171f)
                horizontalLineToRelative(-0.114f)
                curveToRelative(-2.073f, 0f, -3.705f, 0f, -4.98f, -0.171f)
                curveToRelative(-1.31f, -0.176f, -2.354f, -0.545f, -3.175f, -1.367f)
                curveToRelative(-0.822f, -0.821f, -1.19f, -1.866f, -1.367f, -3.174f)
                curveToRelative(-0.171f, -1.276f, -0.171f, -2.908f, -0.171f, -4.981f)
                verticalLineToRelative(-0.114f)
                curveToRelative(0f, -2.073f, 0f, -3.705f, 0.171f, -4.98f)
                curveToRelative(0.176f, -1.31f, 0.545f, -2.354f, 1.367f, -3.175f)
                curveToRelative(0.821f, -0.822f, 1.866f, -1.19f, 3.174f, -1.367f)
                moveToRelative(4.773f, 4.432f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.431f, -0.132f)
                lineTo(8.492f, 11.25f)
                horizontalLineTo(7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.696f, -0.472f)
                lineToRelative(1.063f, -2.657f)
                lineToRelative(1.506f, 7.526f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.431f, 0.132f)
                lineToRelative(1.812f, -4.529f)
                horizontalLineTo(17f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.696f, 0.471f)
                lineTo(13.24f, 14.38f)
                close()
            }
        }.build()

        return _ActivitySquare!!
    }

@Suppress("ObjectPropertyName")
private var _ActivitySquare: ImageVector? = null
